# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Launch and configuration files for calibrating Fetch using the 'robot_calibration' package."
AUTHOR = "Eric Relson <erelson@fetchrobotics.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://docs.fetchrobotics.com/calibration.html"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache2"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=c93e37fc0c6f510db5735eb91dcc1550"

ROS_CN = "fetch_ros"
ROS_BPN = "fetch_calibration"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python3-setuptools-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    robot-calibration \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/noetic/fetch_calibration/0.9.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/fetch_calibration"
SRC_URI = "git://github.com/fetchrobotics-gbp/fetch_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "cbae3864b7e2e69d72b3196828eed1052729cbc2"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
