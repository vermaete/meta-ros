# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Gazebo worlds for Leo Rover simulation in ROS 2"
AUTHOR = "Fictionlab <support@fictionlab.pl>"
ROS_AUTHOR = "Jan Hernas <janek@fictionlab.pl>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=92566b45c3390e5178465bcaade208b7"

ROS_CN = "leo_simulator"
ROS_BPN = "leo_gz_worlds"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-copyright \
    ament-cmake-lint-cmake \
    ament-cmake-xmllint \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/leo_simulator-release/archive/release/humble/leo_gz_worlds/1.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/leo_gz_worlds"
SRC_URI = "git://github.com/ros2-gbp/leo_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "fe7a28857d1d3e7f6e457b9daa20dbc02c9c727e"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
