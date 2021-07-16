# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "jsk interactive markers"
AUTHOR = "furuta <furuta@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "furuta <furuta@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/interactive_marker"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_visualization"
ROS_BPN = "jsk_interactive_marker"

ROS_BUILD_DEPENDS = " \
    actionlib \
    cmake-modules \
    dynamic-reconfigure \
    dynamic-tf-publisher \
    eigen-conversions \
    geometry-msgs \
    interactive-markers \
    jsk-footstep-msgs \
    jsk-recognition-msgs \
    jsk-recognition-utils \
    jsk-rviz-plugins \
    jsk-topic-tools \
    libtinyxml \
    message-filters \
    message-generation \
    mk \
    moveit-msgs \
    rosbuild \
    roscpp \
    roseus \
    roslib \
    rviz \
    sensor-msgs \
    tf \
    tf-conversions \
    urdf \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    dynamic-reconfigure \
    dynamic-tf-publisher \
    eigen-conversions \
    geometry-msgs \
    interactive-markers \
    jsk-footstep-msgs \
    jsk-recognition-msgs \
    jsk-recognition-utils \
    jsk-rviz-plugins \
    jsk-topic-tools \
    libtinyxml \
    message-filters \
    message-runtime \
    moveit-msgs \
    roscpp \
    roseus \
    roslib \
    rviz \
    sensor-msgs \
    tf \
    tf-conversions \
    urdf \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    dynamic-reconfigure \
    dynamic-tf-publisher \
    eigen-conversions \
    geometry-msgs \
    interactive-markers \
    jsk-footstep-msgs \
    jsk-recognition-msgs \
    jsk-recognition-utils \
    jsk-rviz-plugins \
    jsk-topic-tools \
    libtinyxml \
    message-filters \
    message-runtime \
    moveit-msgs \
    roscpp \
    roseus \
    roslib \
    rviz \
    sensor-msgs \
    tf \
    tf-conversions \
    urdf \
    visualization-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_visualization-release/archive/release/melodic/jsk_interactive_marker/2.1.7-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/jsk_interactive_marker"
SRC_URI = "git://github.com/tork-a/jsk_visualization-release;${ROS_BRANCH};protocol=https"
SRCREV = "7d3843eb0f9cdb0dd56aee41b2e4a1a3184effe9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
