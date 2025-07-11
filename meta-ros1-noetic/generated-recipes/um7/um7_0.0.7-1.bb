# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The um7 package provides a C++ implementation of the CH Robotics serial protocol, and a     corresponding ROS node for publishing standard ROS orientation topics from a UM7."
AUTHOR = "Daniel Miller <dgmiller@ncsu.edu>"
ROS_AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "um7"
ROS_BPN = "um7"

ROS_BUILD_DEPENDS = " \
    message-generation \
    roscpp \
    sensor-msgs \
    serial \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    sensor-msgs \
    serial \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    roscpp \
    sensor-msgs \
    serial \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/um7-release/archive/release/noetic/um7/0.0.7-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/um7"
SRC_URI = "git://github.com/ros-drivers-gbp/um7-release;${ROS_BRANCH};protocol=https"
SRCREV = "30277c518249373b43816a7fcfcc46ef2eddd55e"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
