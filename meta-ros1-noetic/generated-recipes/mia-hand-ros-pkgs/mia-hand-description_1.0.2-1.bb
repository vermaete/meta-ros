# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Package containing Mia Hand URDF model. Includes Gazebo tags that allow     for URDF usage in Gazebo simulator. Includes description of the index_thumb     opposition passive joint."
AUTHOR = "Andrea Burani <andreabu@prensilia.com>"
ROS_AUTHOR = "Francesca Cini <francescaci@prensilia.com>"
HOMEPAGE = "https://wiki.ros.org/mia_hand_ros_pkgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mia_hand_ros_pkgs"
ROS_BPN = "mia_hand_description"

ROS_BUILD_DEPENDS = " \
    joint-limits-interface \
    roscpp \
    rostime \
    sensor-msgs \
    std-msgs \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    joint-limits-interface \
    roscpp \
    rostime \
    sensor-msgs \
    std-msgs \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-limits-interface \
    joint-state-publisher \
    joint-state-publisher-gui \
    robot-state-publisher \
    roscpp \
    rostime \
    rviz \
    sensor-msgs \
    std-msgs \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/Prensilia-srl/mia_hand_ros_pkgs-release/archive/release/noetic/mia_hand_description/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/mia_hand_description"
SRC_URI = "git://github.com/Prensilia-srl/mia_hand_ros_pkgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "9be7d5a6812bf6fa968160e42fdaaba8f0c5fc50"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
