# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Lanelet2 projection library for lat/lon to local x/y conversion"
AUTHOR = "Jan-Hendrik Pauls <jan-hendrik.pauls@kit.edu>"
ROS_AUTHOR = "Jan-Hendrik Pauls <jan-hendrik.pauls@kit.edu>"
HOMEPAGE = "https://github.com/fzi-forschungszentrum-informatik/lanelet2.git"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "lanelet2"
ROS_BPN = "lanelet2_projection"

ROS_BUILD_DEPENDS = " \
    geographiclib \
    lanelet2-io \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
    mrt-cmake-modules-native \
"

ROS_EXPORT_DEPENDS = " \
    geographiclib \
    lanelet2-io \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    mrt-cmake-modules-native \
"

ROS_EXEC_DEPENDS = " \
    geographiclib \
    lanelet2-io \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fzi-forschungszentrum-informatik/lanelet2-release/archive/release/dashing/lanelet2_projection/1.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/lanelet2_projection"
SRC_URI = "git://github.com/fzi-forschungszentrum-informatik/lanelet2-release;${ROS_BRANCH};protocol=https"
SRCREV = "cba00957f82adec575359901728f7cf7695c8f98"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
