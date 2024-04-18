# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS node for Bumblebee Stereo Cameras using libdc1394 interface (based on mrpt-hwdrivers)"
AUTHOR = "José Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
ROS_AUTHOR = "José Luis Blanco-Claraco"
HOMEPAGE = "https://github.com/mrpt-ros-pkg/mrpt_sensors"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_sensors"
ROS_BPN = "mrpt_sensor_bumblebee_stereo"

ROS_BUILD_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    mrpt-msgs \
    mrpt-sensorlib \
    mrpt2 \
    rclcpp \
    rclcpp-components \
    ros-environment \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    mrpt-msgs \
    mrpt-sensorlib \
    mrpt2 \
    rclcpp \
    rclcpp-components \
    tf2 \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
    mrpt-msgs \
    mrpt-sensorlib \
    mrpt2 \
    rclcpp \
    rclcpp-components \
    tf2 \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mrpt_sensors-release/archive/release/humble/mrpt_sensor_bumblebee_stereo/0.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/mrpt_sensor_bumblebee_stereo"
SRC_URI = "git://github.com/ros2-gbp/mrpt_sensors-release;${ROS_BRANCH};protocol=https"
SRCREV = "97f7f81ce5b5bb7f3aed20af8cf3ee65f68ee3cf"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
