package tests.javafuzzer1684;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 01:22:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3833015707279115366L;
    public static double dFld=0.82706;
    public static boolean bFld=true;
    public int iFld=-14;
    public static byte byFld=-102;
    public float fFld=9.853F;
    public static int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 60953);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i6=-240, i7=7, i8=14, i9=-47643, i10=-11, i11=125, i12=253, iArr[]=new int[N];
        short s1=9017;
        float f=-104.393F;
        boolean b1=true, bArr[]=new boolean[N];
        byte byArr[][]=new byte[N][N];

        FuzzerUtils.init(byArr, (byte)-11);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(iArr, 1);

        if (b1) {
            i6 += s1;
        } else if (b1) {
            try {
                byArr[(-3 >>> 1) % N][(i6 >>> 1) % N] += (byte)i6;
            }
            catch (ArrayIndexOutOfBoundsException exc2) {
                f *= i6;
                for (i7 = 9; i7 < 287; i7++) {
                    for (i9 = 1; i9 < 6; i9++) {
                        for (i11 = 1; i11 < 2; i11++) {
                            boolean b=false;
                            bArr[i7] = b;
                            Test.dFld *= -35.81429;
                            i8 = i11;
                        }
                        switch (((i7 >>> 1) % 3) + 97) {
                        case 97:
                        case 98:
                            Test.instanceCount <<= Test.instanceCount;
                            try {
                                i12 = (iArr[i7 - 1] / -1092080802);
                                i10 = (189 % iArr[i9 + 1]);
                                i10 = (i7 / iArr[i7]);
                            } catch (ArithmeticException a_e) {}
                            s1 += (short)25480;
                            break;
                        case 99:
                            b1 = b1;
                        default:
                            i8 = i11;
                        }
                    }
                }
            }
            vMeth2_check_sum += i6 + s1 + Float.floatToIntBits(f) + i7 + i8 + i9 + i10 + i11 + i12 + (b1 ? 1 : 0) +
                FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
            return;
        } else {
            i8 += -48618;
            vMeth2_check_sum += i6 + s1 + Float.floatToIntBits(f) + i7 + i8 + i9 + i10 + i11 + i12 + (b1 ? 1 : 0) +
                FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
            return;
        }
        vMeth2_check_sum += i6 + s1 + Float.floatToIntBits(f) + i7 + i8 + i9 + i10 + i11 + i12 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(int i3) {

        int i4=-44996, i5=-51378, i13=-2, i14=-22303, i15=-204;
        long l1=-20727L;
        short s2=-14293, s3=-8136;
        float f1=107.462F;
        byte by=38;

        for (i4 = 5; i4 < 136; i4++) {
            switch ((i4 % 8) + 97) {
            case 97:
                vMeth2();
                for (i13 = 12; i13 > 1; i13 -= 3) {
                    i5 += i3;
                    switch ((((5117 >>> 1) % 10) * 5) + 74) {
                    case 75:
                        Test.instanceCount += (i13 * i13);
                        break;
                    case 89:
                        Test.iArrFld[i4][i4 + 1] += i5;
                        i14 -= i5;
                        i14 &= (int)Test.instanceCount;
                        l1 = 1;
                        while (++l1 < 4) {
                            i5 >>= i13;
                            Test.iArrFld[(int)(l1 - 1)][i13 - 1] *= i4;
                            s2 *= (short)i4;
                            s2 &= (short)l1;
                        }
                        break;
                    case 115:
                        i14 += (i13 | i5);
                    case 81:
                        f1 += (i13 * i14);
                        break;
                    case 93:
                        f1 = i13;
                    case 90:
                        Test.instanceCount = i14;
                        break;
                    case 87:
                        i14 &= i3;
                        break;
                    case 113:
                        i3 = (int)l1;
                        break;
                    case 118:
                        if (i14 != 0) {
                            vMeth1_check_sum += i3 + i4 + i5 + i13 + i14 + l1 + s2 + Float.floatToIntBits(f1) + by +
                                i15 + s3;
                            return;
                        }
                        break;
                    case 103:
                        i5 = (int)Test.instanceCount;
                        break;
                    }
                }
                break;
            case 98:
                by += (byte)(((i4 * i13) + i15) - Test.instanceCount);
            case 99:
                i3 += i4;
                break;
            case 100:
                Test.dFld += 11;
                break;
            case 101:
                Test.instanceCount = i4;
                break;
            case 102:
                i3 = (int)Test.instanceCount;
            case 103:
                i14 |= s3;
                break;
            case 104:
                i3 = i3;
                break;
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i13 + i14 + l1 + s2 + Float.floatToIntBits(f1) + by + i15 + s3;
    }

    public static void vMeth(long l, short s) {

        int i=59706, i1=101, i2=13853, i16=-164, i17=-4748, i18=49170, i19=13;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -62310L);

        lArr[(i >>> 1) % N] >>= Long.reverseBytes(l);
        for (i1 = 1; i1 < 121; ++i1) {
            i ^= i;
            vMeth1(i2);
            i += (i1 * i1);
            for (i16 = 1; i16 < 13; ++i16) {
                i17 >>= i17;
                Test.dFld = i2;
                i2 += i1;
                if (Test.bFld) break;
                Test.instanceCount <<= i17;
                for (i18 = 2; i1 < i18; i18--) {
                    Test.dFld += 131;
                    i2 = -11;
                }
                Test.iArrFld[i1][i16 + 1] ^= i17;
            }
        }
        vMeth_check_sum += l + s + i + i1 + i2 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        short s4=6731;
        int i20=10, i21=-38033, i22=41418, i23=-117, i24=141, i25=-53997, i26=165, i27=-25075, i28=-6319, i29=7,
            i30=-47881, i31=6;
        long l2=-818643299407662242L;

        vMeth(Test.instanceCount, s4);
        iFld += (int)Test.dFld;
        for (i20 = 19; 384 > i20; i20++) {
            if (Test.bFld) break;
            iFld = -40;
            for (i22 = 69; i22 > 1; --i22) {
                Test.iArrFld[i22 + 1][i20] += 33156;
                i21 = i22;
                i23 = (int)Test.dFld;
            }
            for (i24 = 1; i24 < 69; i24++) {
                i25 += (int)5L;
                for (i26 = 1; i26 < 2; ++i26) {
                    Test.byFld = (byte)i28;
                    fFld *= (float)Test.dFld;
                }
                iFld += (11 + (i24 * i24));
                if (true) continue;
                i23 = -884;
                Test.instanceCount += i22;
                Test.dFld = i26;
                for (i29 = 1; 2 > i29; i29 += 2) {
                    Test.instanceCount = Test.instanceCount;
                    Test.iArrFld[i20 - 1][i29 + 1] *= i28;
                }
                Test.instanceCount %= (long)-123.86259;
            }
            Test.bFld = true;
            fFld += i27;
            Test.iArrFld[i20 + 1][i20] = (int)Test.instanceCount;
            Test.instanceCount <<= i27;
        }
        for (l2 = 308; l2 > 10; l2--) {
            i27 += (int)Test.dFld;
            Test.instanceCount %= (Test.instanceCount | 1);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
