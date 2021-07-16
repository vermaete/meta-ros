# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "rqt_py_common provides common functionality for rqt plugins written in Python.     Despite no plugin is provided, this package is part of the rqt_common_plugins     repository to keep refactoring generic functionality from these common plugins     into this package as easy as possible.      Functionality included in this package should cover generic ROS concepts and     should not introduce any special dependencies beside &quot;ros_base&quot;."
AUTHOR = "Dorian Scholz <scholz@sim.tu-darmstadt.de>"
ROS_AUTHOR = "Dorian Scholz"
HOMEPAGE = "http://ros.org/wiki/rqt_py_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt"
ROS_BPN = "rqt_py_common"

ROS_BUILD_DEPENDS = " \
    genmsg \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    genpy \
    python-qt-binding \
    qt-gui \
    rosbag \
    roslib \
    rospy \
    rostopic \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    genpy \
    python-qt-binding \
    qt-gui \
    rosbag \
    roslib \
    rospy \
    rostopic \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rqt-release/archive/release/melodic/rqt_py_common/0.5.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rqt_py_common"
SRC_URI = "git://github.com/ros-gbp/rqt-release;${ROS_BRANCH};protocol=https"
SRCREV = "f9c97d8707e97fb351cc6e4002ceb34a602a1a22"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
