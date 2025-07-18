# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Rviz plugins for costmap_cspace_msgs"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
ROS_AUTHOR = "Naotaka Hatao <nhatao@seqsense.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "neonavigation_rviz_plugins"
ROS_BPN = "costmap_cspace_rviz_plugins"

ROS_BUILD_DEPENDS = " \
    costmap-cspace-msgs \
    qtbase \
    roscpp \
    rviz \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-cspace-msgs \
    qtbase \
    roscpp \
    rviz \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-cspace-msgs \
    qtbase \
    roscpp \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/at-wat/neonavigation_rviz_plugins-release/archive/release/noetic/costmap_cspace_rviz_plugins/0.17.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/costmap_cspace_rviz_plugins"
SRC_URI = "git://github.com/at-wat/neonavigation_rviz_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "ebaa989293dd7c3a4a2d9e117e47bf4e1d869890"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
