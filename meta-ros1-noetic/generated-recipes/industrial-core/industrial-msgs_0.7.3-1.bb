# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The industrial message package containes industrial specific messages  	definitions. This package is part of the ROS-Industrial program."
AUTHOR = "G.A. vd. Hoorn (TU Delft Robotics Institute) <g.a.vanderhoorn@tudelft.nl>"
ROS_AUTHOR = "Shaun Edwards"
HOMEPAGE = "http://ros.org/wiki/industrial_msg"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "industrial_core"
ROS_BPN = "industrial_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    std-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    std-msgs \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-industrial-release/industrial_core-release/archive/release/noetic/industrial_msgs/0.7.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/industrial_msgs"
SRC_URI = "git://github.com/ros-industrial-release/industrial_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "d52e597fb01072ae893bc2a70b7cc177ec1df283"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
