# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The pr2_gripper_sensor_controller package is a real-time controller that integrates signals from the PR2 hand-mounted accelerometer and finger-mounted pressure sensors with motor control of the gripper joint to do highly responsive sensing and low-latency closed-loop control."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Joe Romano"
HOMEPAGE = "http://ros.org/wiki/pr2_gripper_sensor_controller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_gripper_sensor"
ROS_BPN = "pr2_gripper_sensor_controller"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    pluginlib \
    pr2-controller-interface \
    pr2-controller-manager \
    pr2-controllers-msgs \
    pr2-gripper-sensor-msgs \
    pr2-mechanism-model \
    realtime-tools \
    roscpp \
    roslib \
    rosrt \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    pluginlib \
    pr2-controller-interface \
    pr2-controller-manager \
    pr2-controllers-msgs \
    pr2-gripper-sensor-msgs \
    pr2-mechanism-model \
    realtime-tools \
    roscpp \
    roslib \
    rosrt \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    pluginlib \
    pr2-controller-interface \
    pr2-controller-manager \
    pr2-controllers-msgs \
    pr2-gripper-sensor-msgs \
    pr2-mechanism-model \
    realtime-tools \
    roscpp \
    roslib \
    rosrt \
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

# matches with: https://github.com/pr2-gbp/pr2_gripper_sensor-release/archive/release/melodic/pr2_gripper_sensor_controller/1.0.11-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2_gripper_sensor_controller"
SRC_URI = "git://github.com/pr2-gbp/pr2_gripper_sensor-release;${ROS_BRANCH};protocol=https"
SRCREV = "13e899554d1ffcf5d74d8c6e693e3591472513a4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
