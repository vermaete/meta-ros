# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The mpc_local_planner_examples package"
AUTHOR = "Christoph Rösmann <christoph.roesmann@tu-dortmund.de>"
ROS_AUTHOR = "Christoph Rösmann <christoph.roesmann@tu-dortmund.de>"
HOMEPAGE = "http://wiki.ros.org/mpc_local_planner_examples"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mpc_local_planner"
ROS_BPN = "mpc_local_planner_examples"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    amcl \
    map-server \
    move-base \
    mpc-local-planner \
    mpc-local-planner-msgs \
    stage-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/rst-tu-dortmund/mpc_local_planner-release/archive/release/noetic/mpc_local_planner_examples/0.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/mpc_local_planner_examples"
SRC_URI = "git://github.com/rst-tu-dortmund/mpc_local_planner-release;${ROS_BRANCH};protocol=https"
SRCREV = "6931794c7a05adae6d677bffc6c42389751ef408"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
