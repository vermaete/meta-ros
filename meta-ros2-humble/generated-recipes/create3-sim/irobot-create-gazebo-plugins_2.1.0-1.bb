# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Provides the Gazebo plugins for the iRobot(R) Create(R) 3 Educational Robot."
AUTHOR = "Ekumen <ekumen@irbt.onmicrosoft.com>"
ROS_AUTHOR = "iRobot"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "create3_sim"
ROS_BPN = "irobot_create_gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    gazebo-ros \
    gazebo-rosdev \
    geometry-msgs \
    irobot-create-msgs \
    irobot-create-toolbox \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-ros \
    gazebo-rosdev \
    geometry-msgs \
    irobot-create-msgs \
    irobot-create-toolbox \
    rclcpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros \
    gazebo-rosdev \
    geometry-msgs \
    irobot-create-msgs \
    irobot-create-toolbox \
    rclcpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-flake8 \
    ament-cmake-lint-cmake \
    ament-cmake-pep257 \
    ament-cmake-uncrustify \
    ament-cmake-xmllint \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/create3_sim-release/archive/release/humble/irobot_create_gazebo_plugins/2.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/irobot_create_gazebo_plugins"
SRC_URI = "git://github.com/ros2-gbp/create3_sim-release;${ROS_BRANCH};protocol=https"
SRCREV = "dece935213b3017928a8b52ee4bb5921d15455d2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
