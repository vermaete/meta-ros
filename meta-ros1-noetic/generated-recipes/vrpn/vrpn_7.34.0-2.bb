# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The VRPN is a library and set of servers that interfaces with virtual-reality systems, such as VICON, OptiTrack, and others."
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
ROS_AUTHOR = "Russell M. Taylor"
HOMEPAGE = "https://github.com/vrpn/vrpn/wiki"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSL1.0"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1c7945be8716a98e36e855a20dc9b844"

ROS_CN = "vrpn"
ROS_BPN = "vrpn"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/vrpn-release/archive/release/noetic/vrpn/7.34.0-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/vrpn"
SRC_URI = "git://github.com/ros-drivers-gbp/vrpn-release;${ROS_BRANCH};protocol=https"
SRCREV = "95a6a5232a64559152df35581ea5c0581adad844"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
