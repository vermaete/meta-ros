# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "The entry point package to launch testing in ROS."
AUTHOR = "Michel Hidalgo <michel@ekumenlabs.com>"
ROS_AUTHOR = "Michel Hidalgo <michel@ekumenlabs.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros_testing"
ROS_BPN = "ros_testing"

ROS_BUILD_DEPENDS = " \
    ament-cmake-core \
    ament-cmake-export-dependencies \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    launch-testing \
    launch-testing-ament-cmake \
    launch-testing-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    launch-testing-ament-cmake-native \
    ros2test-native \
"

ROS_EXEC_DEPENDS = " \
    launch-testing \
    launch-testing-ros \
    ros2test \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros_testing-release/archive/release/eloquent/ros_testing/0.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/ros_testing"
SRC_URI = "git://github.com/ros2-gbp/ros_testing-release;${ROS_BRANCH};protocol=https"
SRCREV = "b1c96edca51be8601ad370cf0a38f2e0a700c9d2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
