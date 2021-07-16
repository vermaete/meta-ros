# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "MoveIt plugin to generate industrial trajectories PTP, LIN, CIRC and sequences thereof."
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "pilz_industrial_motion_planner"

ROS_BUILD_DEPENDS = " \
    joint-limits-interface \
    moveit-core \
    moveit-msgs \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    orocos-kdl \
    pluginlib \
    roscpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-kdl \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    joint-limits-interface \
    moveit-core \
    moveit-msgs \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    orocos-kdl \
    pluginlib \
    roscpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-kdl \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-limits-interface \
    moveit-core \
    moveit-msgs \
    moveit-ros-move-group \
    moveit-ros-planning \
    moveit-ros-planning-interface \
    orocos-kdl \
    pluginlib \
    roscpp \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-kdl \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    cmake-modules \
    code-coverage \
    moveit-resources-panda-moveit-config \
    moveit-resources-prbt-moveit-config \
    moveit-resources-prbt-pg70-support \
    moveit-resources-prbt-support \
    pilz-industrial-motion-planner-testutils \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/moveit-release/archive/release/noetic/pilz_industrial_motion_planner/1.1.5-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/pilz_industrial_motion_planner"
SRC_URI = "git://github.com/ros-gbp/moveit-release;${ROS_BRANCH};protocol=https"
SRCREV = "593f79052d55e566ef3beaeb0a77cd07ebba93b0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
