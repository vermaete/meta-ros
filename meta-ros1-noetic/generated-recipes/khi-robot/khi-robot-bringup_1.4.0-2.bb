# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Package contains bringup scripts/config/tools for KHI Robot"
AUTHOR = "nakamichi_d <nakamichi_d@khi.co.jp>"
ROS_AUTHOR = "nakamichi_d <nakamichi_d@khi.co.jp>"
HOMEPAGE = "http://ros.org/wiki/khi_robot"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "khi_robot"
ROS_BPN = "khi_robot_bringup"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-manager \
    joint-state-controller \
    joint-trajectory-controller \
    khi-duaro-description \
    khi-duaro-moveit-config \
    khi-robot-control \
    position-controllers \
    robot-state-publisher \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager \
    joint-state-controller \
    joint-trajectory-controller \
    khi-duaro-description \
    khi-duaro-moveit-config \
    khi-robot-control \
    position-controllers \
    robot-state-publisher \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/Kawasaki-Robotics/khi_robot-release/archive/release/noetic/khi_robot_bringup/1.4.0-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/khi_robot_bringup"
SRC_URI = "git://github.com/Kawasaki-Robotics/khi_robot-release;${ROS_BRANCH};protocol=https"
SRCREV = "e31f70dbb6b147aa776417c134cd0820192998bb"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
