# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Package to communicate DJI Tello drones with Aerostack2 framework"
AUTHOR = "CVAR-UPM <cvar.upm3@gmail.com>"
ROS_AUTHOR = "dani_sanchez"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "aerostack2"
ROS_BPN = "as2_platform_tello"

ROS_BUILD_DEPENDS = " \
    as2-core \
    as2-msgs \
    geometry-msgs \
    libeigen \
    nav-msgs \
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
    as2-core \
    as2-msgs \
    geometry-msgs \
    libeigen \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    as2-core \
    as2-msgs \
    geometry-msgs \
    libeigen \
    nav-msgs \
    rclcpp \
    rclpy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-clang-format \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/aerostack2-release/archive/release/humble/as2_platform_tello/1.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/as2_platform_tello"
SRC_URI = "git://github.com/ros2-gbp/aerostack2-release;${ROS_BRANCH};protocol=https"
SRCREV = "62d81bade24281d8001929bba55c37a7dee498bc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
