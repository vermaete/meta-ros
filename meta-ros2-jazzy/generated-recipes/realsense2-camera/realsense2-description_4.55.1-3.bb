# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "RealSense description package for Intel 3D D400 cameras"
AUTHOR = "LibRealSense ROS Team <librs.ros@intel.com>"
ROS_AUTHOR = "LibRealSense ROS Team <librs.ros@intel.com>"
HOMEPAGE = "http://www.ros.org/wiki/RealSense"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "realsense2_camera"
ROS_BPN = "realsense2_description"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    realsense2-camera-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    realsense2-camera-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    launch-ros \
    rclcpp \
    rclcpp-components \
    realsense2-camera-msgs \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/IntelRealSense/realsense-ros-release/archive/release/jazzy/realsense2_description/4.55.1-3.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/realsense2_description"
SRC_URI = "git://github.com/IntelRealSense/realsense-ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "dbdca2538210cac2b854291ba47f099df80224d9"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
