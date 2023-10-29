# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Clearpath Platform Drivers."
AUTHOR = "Luis Camero <lcamero@clearpathrobotics.com>"
ROS_AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "clearpath_common"
ROS_BPN = "clearpath_platform"

ROS_BUILD_DEPENDS = " \
    clearpath-platform-msgs \
    controller-interface \
    controller-manager \
    controller-manager-msgs \
    geometry-msgs \
    hardware-interface \
    nav-msgs \
    pluginlib \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    clearpath-platform-msgs \
    controller-interface \
    controller-manager \
    controller-manager-msgs \
    geometry-msgs \
    hardware-interface \
    nav-msgs \
    pluginlib \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    clearpath-control \
    clearpath-platform-description \
    clearpath-platform-msgs \
    controller-interface \
    controller-manager \
    controller-manager-msgs \
    geometry-msgs \
    hardware-interface \
    nav-msgs \
    pluginlib \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/clearpath_common-release/archive/release/humble/clearpath_platform/0.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/clearpath_platform"
SRC_URI = "git://github.com/clearpath-gbp/clearpath_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "e0a73b5d2110c08a4f1e3c7fd79f978d9e277e3d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
