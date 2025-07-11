# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Graft is not yet finished. It's intended to be a full replacement to     robot_pose_ekf, including native absolute references, and arbitrary     topic configuration.      If you try to use Graft now, please note that not all parameters are     configured and you will not always see a change in behavior by     modifying the parameters."
AUTHOR = "Chad Rockey <chadrockey@gmail.com>"
ROS_AUTHOR = "Chad Rockey <chadrockey@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/graft"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "graft"
ROS_BPN = "graft"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    libeigen \
    message-generation \
    nav-msgs \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    rosconsole \
    roscpp \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/graft-release/archive/release/noetic/graft/0.2.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/graft"
SRC_URI = "git://github.com/ros-gbp/graft-release;${ROS_BRANCH};protocol=https"
SRCREV = "55d514bee23ae0a5811423d715f3ee2c5ca34e2c"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
