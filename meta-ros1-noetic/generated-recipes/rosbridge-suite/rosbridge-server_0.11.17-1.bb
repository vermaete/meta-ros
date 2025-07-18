# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A WebSocket interface to rosbridge."
AUTHOR = "Russell Toris <rctoris@wpi.edu>"
ROS_AUTHOR = "Jonathan Mace <jonathan.c.mace@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/rosbridge_server"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosbridge_suite"
ROS_BPN = "rosbridge_server"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python3-setuptools-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python3-autobahn \
    python3-tornado \
    python3-twisted \
    rosapi \
    rosauth \
    rosbridge-library \
    rosbridge-msgs \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/noetic/rosbridge_server/0.11.17-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rosbridge_server"
SRC_URI = "git://github.com/RobotWebTools-release/rosbridge_suite-release;${ROS_BRANCH};protocol=https"
SRCREV = "dba0adbe877834097ad42d7aa02cf4c6f6d692e5"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
