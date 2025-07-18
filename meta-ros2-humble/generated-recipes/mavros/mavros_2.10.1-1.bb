# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "MAVROS -- MAVLink extendable communication node for ROS     with proxy for Ground Control Station."
AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
ROS_AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/mavros"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GPLv3 & LGPLv3 & BSD"
LICENSE = "GPL-3.0-only & LGPL-3.0-only & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_CN = "mavros"
ROS_BPN = "mavros"

ROS_BUILD_DEPENDS = " \
    angles \
    console-bridge \
    diagnostic-msgs \
    diagnostic-updater \
    eigen-stl-containers \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    libeigen \
    libmavconn \
    mavlink \
    mavros-msgs \
    message-filters \
    nav-msgs \
    pluginlib \
    rclcpp \
    rclcpp-components \
    rcpputils \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    tf2-ros \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
    eigen3-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    console-bridge \
    diagnostic-msgs \
    diagnostic-updater \
    eigen-stl-containers \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    libeigen \
    libmavconn \
    mavlink \
    mavros-msgs \
    message-filters \
    nav-msgs \
    pluginlib \
    rclcpp \
    rclcpp-components \
    rcpputils \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    tf2-ros \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    eigen3-cmake-module-native \
"

ROS_EXEC_DEPENDS = " \
    console-bridge \
    diagnostic-msgs \
    diagnostic-updater \
    eigen-stl-containers \
    geographic-msgs \
    geometry-msgs \
    libmavconn \
    mavros-msgs \
    message-filters \
    nav-msgs \
    pluginlib \
    python3-click \
    rclcpp \
    rclcpp-components \
    rclpy \
    rcpputils \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    tf2-ros \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mavros-release/archive/release/humble/mavros/2.10.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/mavros"
SRC_URI = "git://github.com/ros2-gbp/mavros-release;${ROS_BRANCH};protocol=https"
SRCREV = "5c968c713d4c752fbae52a2f303c987084ea4e8b"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
