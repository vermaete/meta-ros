# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The rt_usb_9axisimu_driver package"
AUTHOR = "RT Corporation <shop@rt-net.jp>"
ROS_AUTHOR = "RT Corporation <shop@rt-net.jp>"
HOMEPAGE = "https://github.com/rt-net/rt_usb_9axisimu_driver/issues"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rt_usb_9axisimu_driver"
ROS_BPN = "rt_usb_9axisimu_driver"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rt_usb_9axisimu_driver-release/archive/release/humble/rt_usb_9axisimu_driver/2.1.0-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/rt_usb_9axisimu_driver"
SRC_URI = "git://github.com/ros2-gbp/rt_usb_9axisimu_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "e39c17a2494bef698a9afb4715e8649b20ec722a"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
