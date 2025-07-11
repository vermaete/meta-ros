# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The flatland_server package"
AUTHOR = "Joseph Duchesne <joseph@avidbots.com>"
ROS_AUTHOR = "Joseph Duchesne <joseph@avidbots.com>"
HOMEPAGE = "https://bitbucket.org/avidbots/flatland"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "flatland"
ROS_BPN = "flatland_server"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    flatland-msgs \
    geometry-msgs \
    interactive-markers \
    lua \
    opencv \
    pluginlib \
    roscpp \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    flatland-msgs \
    geometry-msgs \
    interactive-markers \
    lua \
    opencv \
    pluginlib \
    roscpp \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    flatland-msgs \
    geometry-msgs \
    interactive-markers \
    lua \
    opencv \
    pluginlib \
    roscpp \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
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

# matches with: https://github.com/avidbots/flatland-release/archive/release/noetic/flatland_server/1.3.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/flatland_server"
SRC_URI = "git://github.com/avidbots/flatland-release;${ROS_BRANCH};protocol=https"
SRCREV = "5f60eb7830fff060aadb6f4fb531a2f8c7d188f0"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
