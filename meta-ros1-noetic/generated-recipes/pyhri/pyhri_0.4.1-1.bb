# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A Python wrapper library around the ROS4HRI ROS topics"
AUTHOR = "Séverin Lemaignan <severin.lemaignan@pal-robotics.com>"
ROS_AUTHOR = "Séverin Lemaignan <severin.lemaignan@pal-robotics.com>"
HOMEPAGE = "http://wiki.ros.org/pyhri"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pyhri"
ROS_BPN = "pyhri"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    hri-msgs \
    rospy \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    hri-msgs \
    rospy \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    hri-msgs \
    rospy \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros4hri/pyhri-release/archive/release/noetic/pyhri/0.4.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/pyhri"
SRC_URI = "git://github.com/ros4hri/pyhri-release;${ROS_BRANCH};protocol=https"
SRCREV = "aaead9472b1be9a6ffc51ba91737b61b6bd9869f"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
