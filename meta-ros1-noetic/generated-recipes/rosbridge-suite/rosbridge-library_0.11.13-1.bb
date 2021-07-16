# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The core rosbridge package, responsible for interpreting JSON and performing     the appropriate ROS action, like subscribe, publish, call service, and     interact with params."
AUTHOR = "Russell Toris <rctoris@wpi.edu>"
ROS_AUTHOR = "Jonathan Mace <jonathan.c.mace@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/rosbridge_library"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosbridge_suite"
ROS_BPN = "rosbridge_library"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    python3-pillow \
    python3-pymongo \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    python3-pillow \
    python3-pymongo \
    roscpp \
    rosgraph \
    rospy \
    rosservice \
    rostopic \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    actionlib-msgs \
    diagnostic-msgs \
    nav-msgs \
    rospy-tutorials \
    rostest \
    sensor-msgs \
    std-srvs \
    stereo-msgs \
    tf2-msgs \
    trajectory-msgs \
    visualization-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/noetic/rosbridge_library/0.11.13-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rosbridge_library"
SRC_URI = "git://github.com/RobotWebTools-release/rosbridge_suite-release;${ROS_BRANCH};protocol=https"
SRCREV = "4258f784070cf3da75497a7403104f7c30d0ab8f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
