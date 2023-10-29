# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The robotraconteur package"
AUTHOR = "John Wason <wason@wasontech.com>"
ROS_AUTHOR = "John Wason <wason@wasontech.com>"
HOMEPAGE = "http://robotraconteur.com"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=cd41bc11770726765d770973e9991bab"

ROS_CN = "robotraconteur"
ROS_BPN = "robotraconteur"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libbluetooth-dev} \
    ${ROS_UNRESOLVED_DEP-libdbus-dev} \
    boost \
    libusb1 \
    openssl \
    python3 \
    python3-numpy \
    python3-setuptools \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libbluetooth-dev} \
    ${ROS_UNRESOLVED_DEP-libdbus-dev} \
    boost \
    libusb1 \
    openssl \
    python3 \
    python3-numpy \
    python3-setuptools \
    zlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libbluetooth-dev} \
    ${ROS_UNRESOLVED_DEP-libdbus-dev} \
    boost \
    libusb1 \
    openssl \
    python3 \
    python3-numpy \
    python3-setuptools \
    zlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/robotraconteur-packaging/robotraconteur-ros2-release/archive/release/humble/robotraconteur/0.18.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/robotraconteur"
SRC_URI = "git://github.com/robotraconteur-packaging/robotraconteur-ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "72ab558f29f73049dacebd6bdf33ee0717b16103"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
