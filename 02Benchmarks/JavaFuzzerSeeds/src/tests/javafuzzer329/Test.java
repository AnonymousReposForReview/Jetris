package tests.javafuzzer329;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 02:00:31 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=1012445733L;
    public double dFld=0.87155;
    public byte byFld=-11;
    public static double dArrFld[]=new double[N];
    public long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 90.119647);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(double d, int i3) {

        byte by=64, byArr[]=new byte[N];
        int i4=-21719, i5=54462, i6=13, i7=-186, i8=-50, iArr1[]=new int[N];
        double d1=0.3535;
        float f=-3.24F;
        boolean b=false;

        FuzzerUtils.init(byArr, (byte)122);
        FuzzerUtils.init(iArr1, 9);

        by = (byte)i3;
        byArr = byArr;
        i3 -= i3;
        if (b) {
            for (i4 = 2; 349 > i4; ++i4) {
                iArr1[i4 + 1] = (int)-6.198F;
            }
            for (d1 = 6; d1 < 225; d1++) {
                short s=-6948;
                s *= (short)i3;
                f = i3;
                i3 += i4;
                for (i7 = (int)(d1); i7 < 7; i7++) {
                    try {
                        iArr1[i7 + 1] = (i5 / i4);
                        i6 = (i8 % i7);
                        i8 = (83 % i6);
                    } catch (ArithmeticException a_e) {}
                }
                Test.instanceCount = Test.instanceCount;
            }
            iArr1[(i4 >>> 1) % N] <<= i7;
        }
        Test.instanceCount += (long)d1;
        long meth_res = Double.doubleToLongBits(d) + i3 + by + i4 + i5 + Double.doubleToLongBits(d1) + i6 +
            Float.floatToIntBits(f) + i7 + i8 + (b ? 1 : 0) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth() {

        int i1=58131, i9=34639, i10=-46, i11=-153, i12=-13, iArr2[]=new int[N];
        double d2=-125.86687;
        boolean b1=false;
        float f1=115.318F;
        byte by1=6;

        FuzzerUtils.init(iArr2, 203);

        i1 = 1;
        do {
            int i2=45239;
            i2 += (int)(227L + (i1 * i1));
            i2 -= (int)(lMeth(d2, -158) + i2);
            b1 = b1;
            iArr2 = iArr2;
            i2 = (int)Test.instanceCount;
        } while (++i1 < 125);
        i9 = 171;
        do {
            if (b1) {
                f1 += i1;
                for (i10 = 1; i10 < 9; i10 += 2) {
                    short s1=3916;
                    i11 += (((i10 * i1) + Test.instanceCount) - i1);
                    if (i10 != 0) {
                    }
                    iArr2[i10 + 1] += 4;
                    iArr2[i9] += 78;
                    s1 ^= (short)i12;
                }
            } else if (true) {
                i12 += (i9 * by1);
            } else {
                iArr2[i9 + 1] = i12;
            }
        } while (--i9 > 0);
        long meth_res = i1 + Double.doubleToLongBits(d2) + (b1 ? 1 : 0) + i9 + Float.floatToIntBits(f1) + i10 + i11 +
            i12 + by1 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i13=57161, i14=12610, i15=-52, i16=-21165, iArr3[]=new int[N];
        float f2=0.337F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr3, -127);
        FuzzerUtils.init(lArr, 56394L);

        iMeth();
        for (i13 = 1; i13 < 380; i13++) {
            i14 += (int)Test.instanceCount;
            iArr3[i13 + 1] += (int)Test.instanceCount;
            i14 = i13;
            lArr[i13] = i14;
            lArr = FuzzerUtils.long1array(N, (long)-9L);
            try {
                i14 = (i14 % -9);
                i14 = (i14 % -111);
                i14 = (i13 / i13);
            } catch (ArithmeticException a_e) {}
            i14 = -123;
            try {
                i14 = (i14 / -44131);
                i14 = (i14 / i13);
                iArr3[i13 - 1] = (i14 / i14);
            } catch (ArithmeticException a_e) {}
        }
        f2 = f2;
        i15 = 157;
        while ((i15 -= 3) > 0) {
            i16 = 1;
            do {
                Test.dArrFld[i15 + 1] += Test.instanceCount;
                Test.instanceCount *= 121L;
            } while ((i16 += 3) < 29);
        }
        vMeth_check_sum += i13 + i14 + Float.floatToIntBits(f2) + i15 + i16 + FuzzerUtils.checkSum(iArr3) +
            FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-231, i17=-61, i18=3, i19=23393, i20=-4, i21=97, i22=-71, i23=57665, i24=-70, iArr[]=new int[N];
        float f3=-11.851F;
        boolean b2=true;
        long l=-12L;
        short s2=-30621;

        FuzzerUtils.init(iArr, -100);

        i = (++iArr[(-56979 >>> 1) % N]);
        vMeth();
        i = (int)f3;
        for (i17 = 10; i17 < 237; i17++) {
            i18 -= i18;
        }
        for (i19 = 8; i19 < 345; i19++) {
            lArrFld[i19 - 1] = i20;
            b2 = b2;
            for (i21 = 2; 75 > i21; i21 += 2) {
                i22 *= (int)Test.instanceCount;
                switch ((i19 % 9) + 127) {
                case 127:
                    for (i23 = 1; i23 < 3; ++i23) {
                        i18 *= i24;
                        i20 >>>= i18;
                        i18 = (int)dFld;
                        i24 += (int)l;
                        i20 >>= i21;
                        i = 3;
                        s2 %= (short)-14;
                        i += (-14 + (i23 * i23));
                    }
                    f3 += (i21 * Test.instanceCount);
                    dFld = 38126;
                    i22 += (i21 + i24);
                case 128:
                    switch (((i19 % 4) * 5) + 113) {
                    case 116:
                        Test.bArrFld[i19] = b2;
                        dFld = i21;
                        byFld += (byte)(i21 - i22);
                        break;
                    case 133:
                        i22 += (i21 - i24);
                        iArr[i21 - 1] = i19;
                        break;
                    case 124:
                    case 121:
                        i22 *= (int)204L;
                        break;
                    default:
                        i22 %= 10;
                    }
                case 129:
                    i18 = (int)-36348L;
                    break;
                case 130:
                    dFld += i19;
                    break;
                case 131:
                    i += (i21 - i18);
                    break;
                case 132:
                    i24 += (((i21 * f3) + i23) - f3);
                case 133:
                    iArr[i21 + 1] <<= -214;
                    break;
                case 134:
                    Test.instanceCount = l;
                    break;
                case 135:
                    i18 = i19;
                    break;
                }
            }
        }


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}