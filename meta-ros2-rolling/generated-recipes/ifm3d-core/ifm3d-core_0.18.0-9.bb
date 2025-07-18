# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Library and Utilities for working with ifm pmd-based 3D ToF Cameras"
AUTHOR = "Sean Kelly <sean.kelly@ifm.com>"
ROS_AUTHOR = "Tom Panzarella <tom@boxrobotics.ai>"
HOMEPAGE = "https://github.com/ifm/ifm3d"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "ifm3d_core"
ROS_BPN = "ifm3d_core"

ROS_BUILD_DEPENDS = " \
    boost \
    curl \
    cv-bridge \
    glog \
    pcl \
    xmlrpc-c \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    curl \
    cv-bridge \
    glog \
    pcl \
    xmlrpc-c \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ifm3d-release/archive/release/rolling/ifm3d_core/0.18.0-9.tar.gz
ROS_BRANCH ?= "branch=release/rolling/ifm3d_core"
SRC_URI = "git://github.com/ros2-gbp/ifm3d-release;${ROS_BRANCH};protocol=https"
SRCREV = "01aa8970b76959a9bb14540b198f52f4c4316936"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
