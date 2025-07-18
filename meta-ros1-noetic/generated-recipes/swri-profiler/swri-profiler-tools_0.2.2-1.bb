# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Provides tools for viewing data produced by nodes that use the     swri_profiler library to output profiling information."
AUTHOR = "P. J. Reed <preed@swri.org>"
HOMEPAGE = "https://github.com/swri-robotics/swri_profiler.git"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "swri_profiler"
ROS_BPN = "swri_profiler_tools"

ROS_BUILD_DEPENDS = " \
    qtbase \
    roscpp \
    std-msgs \
    swri-profiler-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    qtbase-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    std-msgs \
    swri-profiler-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    qtbase \
    roscpp \
    std-msgs \
    swri-profiler-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/swri-robotics-gbp/swri_profiler-release/archive/release/noetic/swri_profiler_tools/0.2.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/swri_profiler_tools"
SRC_URI = "git://github.com/swri-robotics-gbp/swri_profiler-release;${ROS_BRANCH};protocol=https"
SRCREV = "3cfba947e20316de2dd1b73e4c6b99d0b1a82cc6"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
