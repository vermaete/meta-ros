# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "Common support functionality used throughout the navigation 2 stack"
AUTHOR = "Carl Delsey <carl.r.delsey@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "navigation2"
ROS_BPN = "nav2_common"

ROS_BUILD_DEPENDS = " \
    ament-cmake-python \
    launch \
    launch-ros \
    osrf-pycommon \
    python3-pyyaml \
    rclpy \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
"

ROS_EXPORT_DEPENDS = " \
    launch \
    launch-ros \
    osrf-pycommon \
    python3-pyyaml \
    rclpy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-core-native \
"

ROS_EXEC_DEPENDS = " \
    launch \
    launch-ros \
    osrf-pycommon \
    python3-pyyaml \
    rclpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/galactic/nav2_common/1.0.6-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/nav2_common"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "e7e9d9c842daea2d4b30d339ea6d5a5187f5eac2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
