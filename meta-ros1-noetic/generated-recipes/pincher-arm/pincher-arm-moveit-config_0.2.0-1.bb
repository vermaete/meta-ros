# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the pincher_arm with the MoveIt! Motion Planning Framework"
AUTHOR = "Fictionlab <support@fictionlab.pl>"
ROS_AUTHOR = "Błażej Sowa <blazej@turtlerover.com>"
HOMEPAGE = "http://moveit.ros.org/"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pincher_arm"
ROS_BPN = "pincher_arm_moveit_config"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    joint-state-publisher \
    moveit-fake-controller-manager \
    moveit-kinematics \
    moveit-planners-ompl \
    moveit-ros-move-group \
    moveit-ros-visualization \
    moveit-setup-assistant \
    moveit-simple-controller-manager \
    pincher-arm-description \
    robot-state-publisher \
    tf2-ros \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-state-publisher \
    moveit-fake-controller-manager \
    moveit-kinematics \
    moveit-planners-ompl \
    moveit-ros-move-group \
    moveit-ros-visualization \
    moveit-setup-assistant \
    moveit-simple-controller-manager \
    pincher-arm-description \
    robot-state-publisher \
    tf2-ros \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fictionlab-gbp/pincher_arm-release/archive/release/noetic/pincher_arm_moveit_config/0.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/pincher_arm_moveit_config"
SRC_URI = "git://github.com/fictionlab-gbp/pincher_arm-release;${ROS_BRANCH};protocol=https"
SRCREV = "26d418bdef5bcb696801ee21facfab3fe3dbb1b1"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
