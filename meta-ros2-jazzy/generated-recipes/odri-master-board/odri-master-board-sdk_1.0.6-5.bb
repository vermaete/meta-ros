# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "This project contains the sdk for the communication between a computer         and the master-board"
AUTHOR = "Maximilien Naveau <mnaveau@tue.mpg.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD 3-Clause"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d84cded89c768806cb84461439476daa"

ROS_CN = "odri_master_board"
ROS_BPN = "odri_master_board_sdk"

ROS_BUILD_DEPENDS = " \
    boost \
    git \
    python3 \
    python3-numpy \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    git \
    python3 \
    python3-numpy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    git \
    python3 \
    python3-numpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/odri_master_board_sdk-release/archive/release/jazzy/odri_master_board_sdk/1.0.6-5.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/odri_master_board_sdk"
SRC_URI = "git://github.com/ros2-gbp/odri_master_board_sdk-release;${ROS_BRANCH};protocol=https"
SRCREV = "89c6951871e6b89f5cd809eb53a14680ea70ea40"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
