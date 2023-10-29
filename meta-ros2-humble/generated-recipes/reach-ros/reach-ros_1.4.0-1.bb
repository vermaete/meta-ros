# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "The reach_ros package"
AUTHOR = "mripperger <mripperger@swri.org>"
ROS_AUTHOR = "mripperger <mripperger@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "reach_ros"
ROS_BPN = "reach_ros"

ROS_BUILD_DEPENDS = " \
    interactive-markers \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning-interface \
    reach \
    sensor-msgs \
    tf2-eigen \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = " \
    interactive-markers \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning-interface \
    reach \
    sensor-msgs \
    tf2-eigen \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    interactive-markers \
    joint-state-publisher \
    moveit-core \
    moveit-msgs \
    moveit-ros-planning-interface \
    reach \
    robot-state-publisher \
    sensor-msgs \
    tf2-eigen \
    visualization-msgs \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/reach_ros2-release/archive/release/humble/reach_ros/1.4.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/reach_ros"
SRC_URI = "git://github.com/ros2-gbp/reach_ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "2f39a8e1d313463e22dcf957b464888521c9ecbb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
