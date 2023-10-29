# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Python bindings for lanelet2"
AUTHOR = "Fabian Immel <fabian.immel@kit.edu>"
ROS_AUTHOR = "Fabian Poggenhans <fabian.poggenhans@kit.edu>"
HOMEPAGE = "https://github.com/fzi-forschungszentrum-informatik/lanelet2.git"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "lanelet2"
ROS_BPN = "lanelet2_python"

ROS_BUILD_DEPENDS = " \
    boost \
    lanelet2-core \
    lanelet2-io \
    lanelet2-matching \
    lanelet2-projection \
    lanelet2-routing \
    lanelet2-traffic-rules \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
    mrt-cmake-modules-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    lanelet2-core \
    lanelet2-io \
    lanelet2-matching \
    lanelet2-projection \
    lanelet2-routing \
    lanelet2-traffic-rules \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    mrt-cmake-modules-native \
"

ROS_EXEC_DEPENDS = " \
    boost \
    lanelet2-core \
    lanelet2-io \
    lanelet2-matching \
    lanelet2-projection \
    lanelet2-routing \
    lanelet2-traffic-rules \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/lanelet2-release/archive/release/humble/lanelet2_python/1.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/lanelet2_python"
SRC_URI = "git://github.com/ros2-gbp/lanelet2-release;${ROS_BRANCH};protocol=https"
SRCREV = "42c00b4def012e062f4c6cc81a328e220924c9e2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
