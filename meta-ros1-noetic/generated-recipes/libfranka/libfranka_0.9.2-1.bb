# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "libfranka is a C++ library for Franka Emika research robots"
AUTHOR = "Franka Emika GmbH <support@franka.de>"
ROS_AUTHOR = "Franka Emika GmbH"
HOMEPAGE = "https://frankaemika.github.io"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "libfranka"
ROS_BPN = "libfranka"

ROS_BUILD_DEPENDS = " \
    libeigen \
    poco \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    poco \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/frankaemika/libfranka-release/archive/release/noetic/libfranka/0.9.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/libfranka"
SRC_URI = "git://github.com/frankaemika/libfranka-release;${ROS_BRANCH};protocol=https"
SRCREV = "343a45575e54c41500ce4061a937d5f19fea3fa9"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
