# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "RoboMaster robot description files"
AUTHOR = "Qiayuan Liao <liaoqiayuan@gmail.com>"
ROS_AUTHOR = "Qiayuan Liao <liaoqiayuan@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "rm_description"
ROS_BPN = "rm_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/rm-controls/rm_description-release/archive/release/noetic/rm_description/0.1.9-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rm_description"
SRC_URI = "git://github.com/rm-controls/rm_description-release;${ROS_BRANCH};protocol=https"
SRCREV = "a25ad389b86410ae15b424d2886c573d01edbea6"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
