# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Provides controllers that use the speed scaling interface of Universal Robots."
AUTHOR = "Denis Stogl <denis@stoglrobotics.de>"
ROS_AUTHOR = "Marvin Große Besselmann <grosse@fzi.de>"
HOMEPAGE = "https://github.com/UniversalRobots/Universal_Robots_ROS2_Driver/issues"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "ur_robot_driver"
ROS_BPN = "ur_controllers"

ROS_BUILD_DEPENDS = " \
    angles \
    controller-interface \
    joint-trajectory-controller \
    lifecycle-msgs \
    pluginlib \
    rclcpp-lifecycle \
    rcutils \
    realtime-tools \
    std-msgs \
    std-srvs \
    ur-dashboard-msgs \
    ur-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    controller-interface \
    joint-trajectory-controller \
    lifecycle-msgs \
    pluginlib \
    rclcpp-lifecycle \
    rcutils \
    realtime-tools \
    std-msgs \
    std-srvs \
    ur-dashboard-msgs \
    ur-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    controller-interface \
    joint-trajectory-controller \
    lifecycle-msgs \
    pluginlib \
    rclcpp-lifecycle \
    rcutils \
    realtime-tools \
    std-msgs \
    std-srvs \
    ur-dashboard-msgs \
    ur-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/Universal_Robots_ROS2_Driver-release/archive/release/jazzy/ur_controllers/2.4.4-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/ur_controllers"
SRC_URI = "git://github.com/ros2-gbp/Universal_Robots_ROS2_Driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "81456938d37f1e728c4d9c25361e77c394d07134"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
