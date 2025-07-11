# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "VL53L1X ToF rangefinder driver"
AUTHOR = "Oleg Kalachev <okalachev@gmail.com>"
HOMEPAGE = "https://github.com/okalachev/vl53l1x_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "vl53l1x_ros"
ROS_BPN = "vl53l1x"

ROS_BUILD_DEPENDS = " \
    message-generation \
    message-runtime \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-generation \
    message-runtime \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-generation \
    message-runtime \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/okalachev/vl53l1x_ros-release/archive/release/noetic/vl53l1x/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/vl53l1x"
SRC_URI = "git://github.com/okalachev/vl53l1x_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "42cdc69ada0cfeb91d64a1907a237f933cceb33b"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
