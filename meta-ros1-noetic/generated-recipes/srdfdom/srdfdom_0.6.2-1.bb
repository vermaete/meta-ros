# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Parser for Semantic Robot Description Format (SRDF)."
AUTHOR = "MoveIt Release Team <moveit_releasers@googlegroups.com>"
ROS_AUTHOR = "Ioan Sucan <isucan@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/srdfdom"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "srdfdom"
ROS_BPN = "srdfdom"

ROS_BUILD_DEPENDS = " \
    boost \
    cmake-modules \
    console-bridge \
    libtinyxml2 \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    libtinyxml2 \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    libtinyxml2 \
    urdf \
    urdfdom-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/srdfdom-release/archive/release/noetic/srdfdom/0.6.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/srdfdom"
SRC_URI = "git://github.com/ros-gbp/srdfdom-release;${ROS_BRANCH};protocol=https"
SRCREV = "22564e89d89e0e24dcf2beb7a9aa86ea2eda084e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
