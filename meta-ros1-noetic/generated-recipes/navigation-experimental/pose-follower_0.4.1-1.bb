# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A implementation of a local planner that attempts to follow a plan as closely as possible."
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://wiki.ros.org/pose_follower"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation_experimental"
ROS_BPN = "pose_follower"

ROS_BUILD_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    dynamic-reconfigure \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    dynamic-reconfigure \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    dynamic-reconfigure \
    nav-core \
    nav-msgs \
    pluginlib \
    roscpp \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation_experimental-release/archive/release/noetic/pose_follower/0.4.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/pose_follower"
SRC_URI = "git://github.com/ros-gbp/navigation_experimental-release;${ROS_BRANCH};protocol=https"
SRCREV = "37332e0aca1c57df1d9043441cffc5a5c3903011"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
