# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "rqt_py_trees provides a GUI plugin for visualizing py_trees behaviour trees based on rqt_tf_tree."
AUTHOR = "Michal Staniaszek <m.staniaszek@gmail.com>"
ROS_AUTHOR = "Thibault Kruse"
HOMEPAGE = "http://ros.org/wiki/rqt_py_trees"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=5ee5b8b046ae48ad94a2037ca953a67b"

ROS_CN = "rqt_py_trees"
ROS_BPN = "rqt_py_trees"

ROS_BUILD_DEPENDS = " \
    py-trees \
    py-trees-msgs \
    rqt-bag \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    py-trees \
    py-trees-msgs \
    python3-pygraphviz \
    python3-rospkg \
    python3-termcolor \
    qt-dotgraph \
    rospy \
    rqt-bag \
    rqt-graph \
    rqt-gui \
    rqt-gui-py \
    unique-id \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    py-trees \
    py-trees-msgs \
    python3-pygraphviz \
    python3-rospkg \
    python3-termcolor \
    qt-dotgraph \
    rospy \
    rqt-bag \
    rqt-graph \
    rqt-gui \
    rqt-gui-py \
    unique-id \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python3-mock \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/stonier/rqt_py_trees-release/archive/release/noetic/rqt_py_trees/0.4.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rqt_py_trees"
SRC_URI = "git://github.com/stonier/rqt_py_trees-release;${ROS_BRANCH};protocol=https"
SRCREV = "2e376e9b8474412c902989e049b984d89b25c17c"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
