# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "`image_geometry` contains C++ and Python libraries for interpreting images     geometrically. It interfaces the calibration parameters in sensor_msgs/CameraInfo     messages with OpenCV functions such as image rectification, much as cv_bridge     interfaces ROS sensor_msgs/Image with OpenCV data types."
AUTHOR = "Kenji Brameld <kenjibrameld@gmail.com>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/image_geometry"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0 & BSD"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "vision_opencv"
ROS_BPN = "image_geometry"

ROS_BUILD_DEPENDS = " \
    opencv \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-python-native \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    opencv \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    opencv \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/vision_opencv-release/archive/release/jazzy/image_geometry/4.0.0-2.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/image_geometry"
SRC_URI = "git://github.com/ros2-gbp/vision_opencv-release;${ROS_BRANCH};protocol=https"
SRCREV = "403431453bca4e2040e6c729a57a789da1395d32"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
