# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Custom messages for real-time pendulum control."
AUTHOR = "Audrow Nash <audrow@openrobotics.org>"
ROS_AUTHOR = "Jackie Kay"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "demos"
ROS_BPN = "pendulum_msgs"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    rosidl-default-generators \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/demos-release/archive/release/humble/pendulum_msgs/0.20.3-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/pendulum_msgs"
SRC_URI = "git://github.com/ros2-gbp/demos-release;${ROS_BRANCH};protocol=https"
SRCREV = "62cba94ab7e9fede660c9e8296d88ca6badd8dc7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
