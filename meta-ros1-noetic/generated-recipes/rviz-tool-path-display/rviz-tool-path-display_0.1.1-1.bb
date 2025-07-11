# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The rviz_tool_path_display package"
AUTHOR = "Michael Ripperger <michael.ripperger@swri.org>"
ROS_AUTHOR = "Michael Ripperger <michael.ripperger@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "rviz_tool_path_display"
ROS_BPN = "rviz_tool_path_display"

ROS_BUILD_DEPENDS = " \
    pluginlib \
    qtbase \
    rviz \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    pluginlib \
    qtbase \
    rviz \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    pluginlib \
    qtbase \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-industrial-release/rviz_tool_path_display-release/archive/release/noetic/rviz_tool_path_display/0.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rviz_tool_path_display"
SRC_URI = "git://github.com/ros-industrial-release/rviz_tool_path_display-release;${ROS_BRANCH};protocol=https"
SRCREV = "3a282ac0999fcdec6b08a43a98bcb92b205f67c1"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
