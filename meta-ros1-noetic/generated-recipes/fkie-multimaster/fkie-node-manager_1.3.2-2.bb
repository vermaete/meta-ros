# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Graphical interface, written in PySide, to manage the running and       configured ROS nodes on different hosts. For discovering       the running ROS master master_discovery node will be used."
AUTHOR = "Alexander Tiderko <alexander.tiderko@gmail.com>"
ROS_AUTHOR = "Alexander Tiderko"
HOMEPAGE = "http://ros.org/wiki/node_manager_fkie"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD, some icons are licensed under the GNU Lesser General Public License (LGPL) or Creative Commons Attribution-Noncommercial 3.0 License"
LICENSE = "BSD-&-some-icons-are-licensed-under-LGPL-or-CC-BY-NC-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=261b66671071bbaa4ac3e568151c48bc"

ROS_CN = "fkie_multimaster"
ROS_BPN = "fkie_node_manager"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    fkie-master-discovery \
    fkie-multimaster-msgs \
    fkie-node-manager-daemon \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    dynamic-reconfigure \
    fkie-master-discovery \
    fkie-master-sync \
    fkie-multimaster-msgs \
    fkie-node-manager-daemon \
    python-qt-binding \
    python3-docutils \
    python3-paramiko \
    python3-pycryptodomex \
    python3-pyqt5 \
    python3-ruamel-yaml \
    rosgraph \
    roslaunch \
    roslib \
    rosmsg \
    rospy \
    rosservice \
    rqt-gui \
    rqt-reconfigure \
    screen \
    xterm \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fkie-release/multimaster_fkie-release/archive/release/noetic/fkie_node_manager/1.3.2-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/fkie_node_manager"
SRC_URI = "git://github.com/fkie-release/multimaster_fkie-release;${ROS_BRANCH};protocol=https"
SRCREV = "4ecf8b02cf96c3cc89a7813157c77a8944a77f4f"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
