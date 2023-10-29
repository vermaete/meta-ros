# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "zstd_point_cloud_transport provides a plugin to point_cloud_transport for sending point clouds     encoded with lib"
AUTHOR = "Alejandro Hernandez Cordero <alejandro@openrobotics.org>"
ROS_AUTHOR = "Alejandro Hernandez Cordero"
HOMEPAGE = "https://wiki.ros.org/draco_point_cloud_transport"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "point_cloud_transport_plugins"
ROS_BPN = "zstd_point_cloud_transport"

ROS_BUILD_DEPENDS = " \
    pluginlib \
    point-cloud-interfaces \
    point-cloud-transport \
    rclcpp \
    zstd \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    point-cloud-interfaces \
    point-cloud-transport \
    rclcpp \
    zstd \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pluginlib \
    point-cloud-interfaces \
    point-cloud-transport \
    rclcpp \
    zstd \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/point_cloud_transport_plugins-release/archive/release/humble/zstd_point_cloud_transport/1.0.8-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/zstd_point_cloud_transport"
SRC_URI = "git://github.com/ros2-gbp/point_cloud_transport_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "fe9d4605b5474bac4dee84f47e321328ebef64d6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
