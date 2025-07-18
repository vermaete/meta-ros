# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Provides controllers that use the speed scaling interface."
AUTHOR = "Felix Exner <exner@fzi.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0 & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "scaled_controllers"
ROS_BPN = "scaled_joint_trajectory_controller"

ROS_BUILD_DEPENDS = " \
    controller-interface \
    hardware-interface \
    joint-trajectory-controller \
    pluginlib \
    realtime-tools \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-interface \
    hardware-interface \
    joint-trajectory-controller \
    pluginlib \
    realtime-tools \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-interface \
    hardware-interface \
    joint-trajectory-controller \
    pluginlib \
    realtime-tools \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UniversalRobots/Universal_Robots_ROS_scaled_controllers-release/archive/release/noetic/scaled_joint_trajectory_controller/0.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/scaled_joint_trajectory_controller"
SRC_URI = "git://github.com/UniversalRobots/Universal_Robots_ROS_scaled_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "4db33691fd0dd621fefe3d0eb5ea9fa95fd0f977"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
