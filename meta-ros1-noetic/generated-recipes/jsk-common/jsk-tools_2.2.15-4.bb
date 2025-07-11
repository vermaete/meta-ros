# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Includes emacs scripts, ros tool alias generator, and launch doc generator."
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Ryohei Ueda (ueda@jsk.t.u-tokyo.ac.jp)"
HOMEPAGE = "http://ros.org/wiki/jsk_tools"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "jsk_common"
ROS_BPN = "jsk_tools"

ROS_BUILD_DEPENDS = " \
    git \
    rosgraph-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-percol} \
    ${ROS_UNRESOLVED_DEP-python-pygithub3} \
    ${ROS_UNRESOLVED_DEP-python-slacker-cli} \
    ${ROS_UNRESOLVED_DEP-python-tabulate-pip} \
    ${ROS_UNRESOLVED_DEP-python3-github} \
    ${ROS_UNRESOLVED_DEP-python3-progressbar} \
    ${ROS_UNRESOLVED_DEP-python3-rosdep} \
    ${ROS_UNRESOLVED_DEP-python3-tabulate} \
    cv-bridge \
    diagnostic-aggregator \
    diagnostic-msgs \
    diagnostic-updater \
    iproute2 \
    jsk-gui-msgs \
    jsk-network-tools \
    jsk-topic-tools \
    python3-colorama \
    python3-requests \
    python3-texttable \
    rosbag \
    rosemacs \
    rosgraph-msgs \
    rospy \
    rqt-reconfigure \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_common-release/archive/release/noetic/jsk_tools/2.2.15-4.tar.gz
ROS_BRANCH ?= "branch=release/noetic/jsk_tools"
SRC_URI = "git://github.com/tork-a/jsk_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "b9e5d35ad66c35ee5de3a9291af5e035982ecf0e"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
