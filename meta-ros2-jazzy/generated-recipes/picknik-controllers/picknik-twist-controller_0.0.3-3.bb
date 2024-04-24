# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Subscribes to twist msg and forwards to hardware"
AUTHOR = "lovro <lovro.ivanov@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "picknik_controllers"
ROS_BPN = "picknik_twist_controller"

ROS_BUILD_DEPENDS = " \
    controller-interface \
    example-interfaces \
    geometry-msgs \
    rclcpp \
    realtime-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-interface \
    example-interfaces \
    geometry-msgs \
    rclcpp \
    realtime-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-interface \
    example-interfaces \
    geometry-msgs \
    rclcpp \
    realtime-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/picknik_controllers-release/archive/release/jazzy/picknik_twist_controller/0.0.3-3.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/picknik_twist_controller"
SRC_URI = "git://github.com/ros2-gbp/picknik_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "c804147e12cf217d0904037f9dcbf6a71df35071"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
