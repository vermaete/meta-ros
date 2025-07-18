# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_kilted
inherit ros_superflore_generated

DESCRIPTION = "Tool to test performance of ROS2 and DDS data layers and communication."
AUTHOR = "Apex AI, Inc. <opensource@apex.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "performance_test"
ROS_BPN = "performance_test"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    ros-environment \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    git-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rmw-implementation \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/performance_test-release/archive/release/kilted/performance_test/2.3.0-2.tar.gz
ROS_BRANCH ?= "branch=release/kilted/performance_test"
SRC_URI = "git://github.com/ros2-gbp/performance_test-release;${ROS_BRANCH};protocol=https"
SRCREV = "87767ca781735109adc4713691e7d8602cf208db"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
