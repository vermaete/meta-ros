# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Grasp generation for Care-O-bot based on OpenRAVE"
AUTHOR = "Felix Messmer <fxm@ipa.fhg.de>"
ROS_AUTHOR = "Witalij Siebert"
HOMEPAGE = "http://ros.org/wiki/cob_manipulation/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_manipulation"
ROS_BPN = "cob_grasp_generation"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python3-setuptools-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python3-six} \
    actionlib \
    actionlib-msgs \
    cob-description \
    cob-manipulation-msgs \
    geometry-msgs \
    moveit-msgs \
    python3-scipy \
    robot-state-publisher \
    roslib \
    rospy \
    rviz \
    schunk-description \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-ros \
    trajectory-msgs \
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

# matches with: https://github.com/ipa320/cob_manipulation-release/archive/release/noetic/cob_grasp_generation/0.7.9-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/cob_grasp_generation"
SRC_URI = "git://github.com/ipa320/cob_manipulation-release;${ROS_BRANCH};protocol=https"
SRCREV = "b2ad7aa4b31f854d2f389b2f12368833d25e0595"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
