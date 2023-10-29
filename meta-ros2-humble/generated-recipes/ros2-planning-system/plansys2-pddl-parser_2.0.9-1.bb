# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "This package contains a library for parsing PDDL domains and problems.        This package derives from the work of Anders Jonsson, contained in https://github.com/wisdompoet/universal-pddl-parser.git     with many modifications by Francisco Martin:       * ROS2 packaging       * Source code structure refactor       * CMakeLists.txt for cmake compilation       * Reading from String instead of files       * Licensing"
AUTHOR = "Francisco Martin Rico <fmrico@gmail.com>"
ROS_AUTHOR = "Anders Jonsson"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License, Version 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=e8978a5103d23266fc6f8ec03dc9eb16"

ROS_CN = "ros2_planning_system"
ROS_BPN = "plansys2_pddl_parser"

ROS_BUILD_DEPENDS = " \
    plansys2-msgs \
    rclcpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    plansys2-msgs \
    rclcpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    plansys2-msgs \
    rclcpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-index-cpp \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/IntelligentRoboticsLabs/ros2_planning_system-release/archive/release/humble/plansys2_pddl_parser/2.0.9-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/plansys2_pddl_parser"
SRC_URI = "git://github.com/IntelligentRoboticsLabs/ros2_planning_system-release;${ROS_BRANCH};protocol=https"
SRCREV = "e9d5dbb3a43f07dc0c8a3ee3bef897fd2af1e732"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
