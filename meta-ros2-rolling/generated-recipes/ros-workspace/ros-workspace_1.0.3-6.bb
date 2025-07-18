# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Provides the prefix level environment files for ROS 2 packages."
AUTHOR = "Michael Jeronimo <michael.jeronimo@openrobotics.org>"
ROS_AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f2c2560c422b1f619ff2ce48845782f5"

ROS_CN = "ros_workspace"
ROS_BPN = "ros_workspace"

ROS_BUILD_DEPENDS = " \
    ament-cmake-core \
    ament-package \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros_workspace-release/archive/release/rolling/ros_workspace/1.0.3-6.tar.gz
ROS_BRANCH ?= "branch=release/rolling/ros_workspace"
SRC_URI = "git://github.com/ros2-gbp/ros_workspace-release;${ROS_BRANCH};protocol=https"
SRCREV = "b85ca36731400021653f2bf90d35bed17b4f6bf1"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
